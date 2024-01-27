pipeline {
    agent any
    
    environment {
        name = 'jaijeet'
    }
    
    parameters{
        string(name:'build',defaultValue:'springboot',description:"share the build number for this application")
        booleanParam(name:'frontEndRequired',defaultValue:true,description:"Deploy with frontend as well")
        choice(name:'environment',choices:['test','stage','production'],description:"Deploy on which Environment")
    }

    stages {
        stage('Run A command') {
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
