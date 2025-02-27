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
                        sh 'mvn clean compile' // Assurez-vous que Maven est installé et configuré
                    } else {
                        bat 'mvn clean compile' // Assurez-vous que Maven est installé et configuré
                    }
                }
            }
        }
        stage('SonarQube Analysis') {
            steps {
                script {
                    if (isUnix()) {
                        sh "sonar-scanner -Dsonar.projectKey=my-project -Dsonar.sources=. -Dsonar.host.url=${env.SONARQUBE_URL} -Dsonar.login=${env.SONARQUBE_TOKEN} -Dsonar.java.binaries=target/classes"
                    } else {
                        bat "sonar-scanner -Dsonar.projectKey=my-project -Dsonar.sources=. -Dsonar.host.url=${env.SONARQUBE_URL} -Dsonar.login=${env.SONARQUBE_TOKEN} -Dsonar.java.binaries=target/classes"
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
            mail to: 'abderrahmanerrachidy@gmail.com',
                 subject: "FAILURE: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
                 body: "Unfortunately, the build failed.\n\nCheck it here: ${env.BUILD_URL}"
        }
    }
}