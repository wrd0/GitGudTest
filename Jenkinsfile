echo "testing"
echo "********************************************"
node(){
	stage('Clone repository') {
        	try {
        		echo scm.dump()
        		checkout scm
        	}catch (err) {
        		throw err
        	}
   	}
}//End Node
