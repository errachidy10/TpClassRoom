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
                        sh 'mvn clean install' // Si vous utilisez Maven
                        // ou
                        // sh './gradlew build'  // Si vous utilisez Gradle
                    } else {
                        bat '"C:\\Program Files\\apache-maven-3.9.9\\bin\\mvn" clean install' // Maven path for Windows
                        // ou
                        // bat 'gradlew.bat build'  // Gradle path for Windows
                    }
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'mvn test'  // Si vous utilisez Maven
                        // ou
                        // sh './gradlew test'  // Si vous utilisez Gradle
                    } else {
                        bat '"C:\\Program Files\\apache-maven-3.9.9\\bin\\mvn" test' // Maven path for Windows
                        // ou
                        // bat 'gradlew.bat test'  // Gradle path for Windows
                    }
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Ici, ajoutez vos étapes de déploiement
            }
        }
    }
}