echo "testing"
node(){
	stage('Clone repository') {
		def failure_stage
                try {
                	def branch_dir = sh(script: 'ls | grep ${BRANCH_NAME}', returnStatus: true)
                	if (branch_dir == 0) {
                       		sh 'cd ${BRANCH_NAME}/bvt_test_container && git pull'
                    	} else {
                        	//Make directory corresponding to branch name
                        	sh 'mkdir ${BRANCH_NAME} && cd ${BRANCH_NAME} && git clone https://github.com/wrd0/GitGudTest'
                    	}
                }
                catch (err) {
                	failure_stage = "clone_repo"
                	throw err
                }
   	}
}//End Node
