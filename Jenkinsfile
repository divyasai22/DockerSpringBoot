pipeline {
     agent { dockerfile true }
    stages {
    	
    	
        stage('Build image') {
            steps {
               sh "docker build -t dockerspringboot ."
                }
            }
    }
}
