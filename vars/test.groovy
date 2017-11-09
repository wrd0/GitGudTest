def call() {
    timestamps {
        test()
    } // End Timestamps
} // End Call

def call(agentNodeName) {
    timestamps {
        node(agentNodeName) {
            test()
        }
    }
}
def test(){
  println "THIS IS A TEST"
}

println "TEST LOADED"
