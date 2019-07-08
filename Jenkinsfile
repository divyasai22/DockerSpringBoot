node('master') {

 stage('Checkout') {
            git url: 'https://github.com/divyasai22/DockerSpringBoot.git', CredentialsID: 'f7b494d3-938d-428e-81ae-74f0efb129a5', branch: 'master'
        }
        
         stage('Build') {
         
         	def mvn_version = 'maven3.6.0'
			withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
			   sh 'mvn clean install'
			}
           

            def pom = readMavenPom file:'pom.xml'
            print pom.version
            env.version = pom.version
        }

        stage('Image') {
            dir ('dockerspringboot') {
                def app = docker.build "localhost:8085/dockerspringboot:${env.version}"
                app.push()
            }
        }
        
   		stage ('Run') {
            docker.image("localhost:9090/dockerspringboot:${env.version}").run('-p 5000:5000 -h account --name account --link discovery')
        }

        stage ('Final') {
            build job: 'docker-springboot-pipeline', wait: false
        } 

}