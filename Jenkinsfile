node {
   def mvnHome = tool 'M3'

   stage('Checkout Code') { 
      git 'https://github.com/ricardogarfe/java-maven-calculator-web-app.git'
   }
   stage('JUnit Test') {
     sh "'${mvnHome}/bin/mvn' clean test"
   }
   stage('Integration Test') {
     sh "'${mvnHome}/bin/mvn' integration-test"
   }
  stage('Performance Test') {
     sh "'${mvnHome}/bin/mvn' verify"
   }
   stage('Deploy') {
      timeout(time: 10, unit: 'MINUTES') {
           input message: 'Deploy this web app to production ?'
      }
      echo 'Deploy...'
   }
}
   
