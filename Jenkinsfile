pipeline {
    agent any

    tools {
        maven 'MAVEN_HOME'
    }

    triggers {
        githubPush()
    }

    stages {
        stage('Git Clone & Clean') {
            steps {
                deleteDir()
                bat 'git clone https://github.com/SripriyaReddy17/MavenJavaDemo.git mavenjava'
                bat 'mvn -f mavenjava/pom.xml clean'
            }
        }

        stage('Install') {
            steps {
                bat 'mvn -f mavenjava/pom.xml install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn -f mavenjava/pom.xml test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn -f mavenjava/pom.xml package'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check the Console Output.'
        }
    }
}
