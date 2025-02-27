pipeline {
    agent any

    environment {
        SONARQUBE_URL = 'http://localhost:9000'
        SONARQUBE_TOKEN = credentials('sonarJenkinsToken') // Assurez-vous d'avoir configuré ce token dans Jenkins
    }

    stages {
        stage('Checkout SCM') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'echo "Building on Unix"'
                    } else {
                        bat 'echo "Building on Windows"'
                    }
                }
            }
        }
        stage('SonarQube Analysis') {
            steps {
                script {
                    if (isUnix()) {
                        sh "sonar-scanner -Dsonar.projectKey=my-project -Dsonar.sources=. -Dsonar.host.url=${env.SONARQUBE_URL} -Dsonar.login=${env.SONARQUBE_TOKEN}"
                    } else {
                        bat "sonar-scanner -Dsonar.projectKey=my-project -Dsonar.sources=. -Dsonar.host.url=${env.SONARQUBE_URL} -Dsonar.login=${env.SONARQUBE_TOKEN}"
                    }
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    if (isUnix()) {
                        sh './run-tests.sh'
                    } else {
                        bat 'run-tests.bat'
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }

    post {
        success {
            mail to: 'abderrahmanerrachidy@gmail.com',
                 subject: "SUCCESS: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
                 body: "Good news, the build succeeded.\n\nCheck it here: ${env.BUILD_URL}"
        }
        failure {
            mail to: 'you@example.com',
                 subject: "FAILURE: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
                 body: "Unfortunately, the build failed.\n\nCheck it here: ${env.BUILD_URL}"
        }
    }
}