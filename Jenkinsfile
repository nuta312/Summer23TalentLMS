pipeline {
    agent any
    parameters {
        choice(name: 'TEST_TYPE', choices: ['Smoke', 'Regression', 'EndToEnd'], description: 'Choose test type')
    }
    stages {
        stage('Build and Run Tests') {
            steps {
                script {
                    def mavenHome = '/usr/share/maven' 
                    def mavenProfile
                    switch (params.TEST_TYPE) {
                        case 'Smoke':
                            mavenProfile = 'SmokeTest'
                            break
                        case 'Regression':
                            mavenProfile = 'RegressionTest'
                            break
                        case 'EndToEnd':
                            mavenProfile = 'EndToEndTest'
                            break
                    }
                    sh "${mavenHome}/bin/mvn clean test -P ${mavenProfile}"
                }
            }
        }
        stage('Reports') {
            steps {
                script {
                    allure([
                        includeProperties: false,
                        jdk: '',
                        properties: [],
                        reportBuildPolicy: 'ALWAYS',
                        results: [[path: 'target/allure-results']]
                    ])
                }
            }
        }
    }
}



