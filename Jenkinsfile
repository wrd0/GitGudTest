echo "testing"

  stage('Clone repository') {

                try {
                    def branch_dir = sh(script: 'ls | grep ${BRANCH_NAME}', returnStatus: true)
                    if (branch_dir == 0) {
                        sh 'cd ${BRANCH_NAME}/bvt_test_container && git pull'
                    } else {
                        //Make directory corresponding to branch name
                        sh 'mkdir ${BRANCH_NAME} && cd ${BRANCH_NAME} && git clone --recursive git@github.ibm.com:IBM-Blockchain/bvt_test_container.git -b ${BRANCH_NAME}'
                    }
                }
                catch (err) {
                    failure_stage = "clone_repo"
                    throw err
                }

   }
