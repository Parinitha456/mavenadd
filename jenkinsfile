pipeline {
      agent any
      stages {
              stage("Cleaning stage") {
                      steps {
                              bat "mvn clean"
                      }
              }
              stage("Testing Stage") {
                     steps {
                            bat "mvn test"
                     }
              }
              stage("Packaging Stage") {
                     steps {
                            bat "mvn package"
                     }
              }
        }
 }
