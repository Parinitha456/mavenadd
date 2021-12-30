pipeline {
      agent any
      stages {
              stage("Parallel Execution") {
                  steps {
                        parallel{
                              a:{
                                 bat "mvnclean"
                              },
                               b:{
                                 bat "mvn test"
                              },
                               c:{
                                 bat "mvn package"
                               }
                        }
                  }
              }
            
//               stage("Cleaning stage") {
//                       steps {
//                               bat "mvn clean"
//                       }
//               }
//               stage("Testing Stage") {
//                      steps {
//                             bat "mvn test"
//                      }
//               }
//               stage("Packaging Stage") {
//                      steps {
//                             bat "mvn package"
//                      }
//               }
            stage("Consolidate Results") {
                  steps {
                     input("Do you want to capture results?")
                     junit'**/target/surefire-reports/TEST-*.xml'
                     archive 'target/*.jar'
                  }
            }
          
                  }
            }
        }
 }
