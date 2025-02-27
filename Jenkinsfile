pipeline {
    agent any

    tools {
        maven 'mvn' // Assurez-vous que Maven est configuré dans Jenkins
    }

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
                        sh 'mvn clean compile'
                    } else {
                        bat 'mvn clean compile'
                    }
                }
            }
        }
        stage('SonarQube Analysis') {
            steps {
                script {
                    if (isUnix()) {
                        sh "mvn sonar:sonar -Dsonar.projectKey=my-project -Dsonar.host.url=${env.SONARQUBE_URL} -Dsonar.login=${env.SONARQUBE_TOKEN}"
                    } else {
                        bat "mvn sonar:sonar -Dsonar.projectKey=my-project -Dsonar.host.url=${env.SONARQUBE_URL} -Dsonar.login=${env.SONARQUBE_TOKEN}"
                    }
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded'
        }
        failure {
            echo 'Pipeline failed'
        }
    }
}
