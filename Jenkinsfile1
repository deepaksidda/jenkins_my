pipeline {
    agent any

    parameters {
        string(name: 'BRANCH', defaultValue: 'dev', description: 'Enter the branch name: dev, qa, uat, or prod')
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Checkout the selected branch
                    checkout([$class: 'GitSCM', branches: [[name: params.BRANCH]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/deepaksidda/jenkins_my.git']]])
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Execute the deploy script based on the selected branch
                    sh "chmod +x deploy.sh && ./deploy.sh ${params.BRANCH}"
                }
            }
        }
    }
}
