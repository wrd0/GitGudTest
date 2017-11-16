import lib.slack

def call() {
    timestamps {
	println 'Inside Call'
        test()
    } // End Timestamps
} // End Call

def call(agentNodeName) {
    timestamps {
        node(agentNodeName) {
	    println "Inside Call w agent ${agentNodeName}"
            test()
        }
    }
}

def test(){
  def slackUtil = new slack()
  slackUtil.sendSlack("THIS IS A T_E_S_T XXYYXX")
  println(System.getProperty("java.class.path"))
}

def whatever(){
 echo 'Forever'
}

println "TEST LOADED"
