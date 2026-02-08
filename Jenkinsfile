pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
      post {
        always {
          junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
        }
      }
    }

    stage('Docker Build') {
      steps {
        sh 'docker build -t springboot-app .'
      }
    }

    stage('Run Container and deploy') {
      steps {
        sh '''
          docker rm -f springboot-app || true
          docker run -d --name springboot-app -p 8081:8080 springboot-app
        '''
      }
      // (Optional) stage-level post
      post {
        success {
          echo 'Container started successfully.'
        }
      }
    }
  }

  // <<<<<< This post must be here (inside pipeline {}, outside stages {})
  post {
    success {
      echo 'Deployment successful! Access at http://34.234.63.124:8081'
    }
    failure {
      echo 'Pipeline failed!'
    }
  }
}
