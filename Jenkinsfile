pipeline {
    agent any
    
    stages {
        stage('Build Maven') {
            steps {
                sh '''
                ls
                date
                pwd
                cal 2024
                '''
            }
        }
        stage('Environment Variables') {
            environment {
                username = 'slave'
            }
            steps {
                sh 'echo "${BUILD_ID}"'
                sh 'echo "${name}"'
                sh 'echo "${username}"'
            }
        }
        stage('Paramete from Users') {
            steps {
                echo 'test'
                sh 'echo "${name}"'
                sh 'echo "${build}"'
            }
        }
        stage('Creating docker build'){
        
        stage('Continue ?') {
            input {
                message "Should we continue?"
                ok "Yes we should"
            }
            steps {
                echo 'Deploy on Test'
            }
        }
        stage('Deploy on Prod') {
            steps {
                echo 'Deploy on Prod'
            }
        }
    }
    
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
