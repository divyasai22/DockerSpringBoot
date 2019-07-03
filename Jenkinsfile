node {

    withMaven(maven:'maven_3_6_1') {

        stage('Checkout') {
            git url: 'https://github.com/divyasai22/DockerSpringBoot.git', CredentialsID: 'divyasai22', branch: 'master'
        }

        stage('Build') {
            sh 'mvn clean install'

            def pom = readMavenPom file:'pom.xml'
            print pom.version
            env.version = pom.version
        }

        stage('Image') {
            dir ('dockerspringboot') {
                def app = docker.build "localhost:9090/dockerspringboot:${env.version}"
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

}