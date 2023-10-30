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
                }
            }
        }
    }
}

