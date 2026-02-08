pipeline {
   agent any
   stages {
       stage('Build') {
           steps {
               sh 'mvn clean package'
           }
       }
       stage('Docker Build') {
           steps {
               sh 'docker build -t springboot-app .'
           }
       }
       stage('Run Container') {
           steps {
               sh 'docker run -d -p 8081:8080 springboot-app'
           }
       }
   }
}
