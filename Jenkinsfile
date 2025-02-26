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
                sh 'mvn clean install' // Si vous utilisez Maven
                // ou
                // sh './gradlew build'  // Si vous utilisez Gradle
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'  // Si vous utilisez Maven
                // ou
                // sh './gradlew test'  // Si vous utilisez Gradle
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