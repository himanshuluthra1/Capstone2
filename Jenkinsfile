node {

    stage("Git Clone"){

        git credentialsId: 'GIT_HUB_CREDENTIALS', url: 'https://github.com/himanshuluthra1/Capstone2'
    }

     stage('Gradle Build') {

       sh './gradlew build'

    }

    stage("Docker build"){
        sh 'docker version'
        sh 'docker build -t jhooq-docker-demo .'
        sh 'docker image list'
        sh 'docker tag jhooq-docker-demo himanshuluthra/jhooq-docker-demo:jhooq-docker-demo'
    }

    stage('Push Docker Image') {
              steps {
                  withDockerRegistry([url: "", credentialsId: "docker-hub"]) {
                      sh "docker tag capstone-project-cloud-devops himanshuluthra/capstone-project-cloud-devops"
                      sh 'docker push himanshuluthra/capstone-project-cloud-devops'
                  }
              }
         }
    
    stage("kubernetes deployment"){
        sh 'kubectl apply -f k8s-spring-boot-deployment.yml'
    }
}