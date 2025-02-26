pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'cp -R /path/to/your/local/project/* .'
                    } else {
                        bat 'xcopy /E /I /Y C:\\Users\\zakar\\IdeaProjects\\TpClassRoom\\* .'
                    }
                }
            }
        }
        stage('Install Dependencies') {
            steps {
                script {
                    if (isUnix()) {
                        sh '"C:\\Program Files\\apache-maven-3.9.9\\bin\\mvn" clean install'
                    } else {
                        bat '"C:\\Program Files\\apache-maven-3.9.9\\bin\\mvn" clean install'
                    }
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'C:\\Program Files\\apache-maven-3.9.9\\bin'
                    } else {
                        bat 'C:\\Program Files\\apache-maven-3.9.9\\bin'
                    }
                }
            }
        }
        stage('Build') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn package'
                    } else {
                        bat 'mvn package'
                    }
                }
            }
        }
    }
}