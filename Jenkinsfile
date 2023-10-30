pipeline {
    agent any
    parameters {
        choice(name: 'TEST_TYPE', choices: ['Smoke', 'Regression', 'EndToEnd'], description: 'Choose test type')
    }

    stages {
        stage('Build and Run Tests') {
            steps {
                script {
                    def mavenHome
                    switch (params.TEST_TYPE) {
                        case 'Smoke':
                            mavenHome = "SMOKE_MAVEN_HOME"
                            break
                        case 'Regression':
                            mavenHome = "REGRESSION_MAVEN_HOME"
                            break
                        case 'EndToEnd':
                            mavenHome = "ENDTOEND_MAVEN_HOME"
                            break
                    }

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
    }
}


