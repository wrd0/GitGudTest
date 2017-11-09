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
  sendSlack "THIS IS A TES T XXYYXX"
  println(System.getProperty("java.class.path"));
}

def whatever(){
 echo 'Forever'
}

println "TEST LOADED"
