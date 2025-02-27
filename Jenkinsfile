pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/errachidy10/TpClassRoom.git', branch: 'master' // or your branch
            }
        }
        stage('Build') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'echo "Building on Unix"'
                        // Add your build commands for Unix here
                    } else {
                        bat 'echo "Building on Windows"'
                        // Add your build commands for Windows here
                    }
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'echo "Testing on Unix"'
                        // Add your test commands for Unix here
                    } else {
                        bat 'echo "Testing on Windows"'
                        // Add your test commands for Windows here
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...dddddddd'
                // Add your deployment steps here
            }
        }
    }
}
