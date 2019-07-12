pipeline {
    agent any
    stages {
    	
    	agent {
        docker {
            image 'maven3.6.0'
            args '-v $HOME/.m2:/root/.m2'
        }
    }
        stage('Build image') {
            steps {
               sh "docker build -t dockerspringboot ."
                }
            }
    }
}
