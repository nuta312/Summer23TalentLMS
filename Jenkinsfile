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

        stage('Publish Allure Reports') {
            steps {
                script {
                    def allureResults = "${env.WORKSPACE}/target/allure-results"
                    def allureCommand = "/var/lib/jenkins/tools/ru.yandex.qatools.allure.jenkins.tools.AllureCommandlineInstallation/Allure/bin/allure"
                    // Генерировать отчеты в target/allure-results
                    sh "${allureCommand} generate ${allureResults}"
                    // Сервировать отчеты сразу
                    sh "${allureCommand} serve ${allureResults}"
                }
            }
        }
    }
}


