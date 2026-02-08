pipeline {
   agent any
   stages {
       stage('Checkout Code') {
           steps {
               git 'https://github.com/TummepalliRuchita/Devops_Project.git'
           }
       }
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
               sh 'docker run -d -p 8080:8080 springboot-app'
           }
       }
   }
}
