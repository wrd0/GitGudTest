def call(method) {
    timestamps {
        echo "given ${method}"
        switch(method){
            case "send": 
                sh "echo SLACK SEND"
            break;
            case "safeSend":
                safeSend methdo
            break;
            default:
                echo "no such method"
            break;
        }
    } // End Timestamps
} // End Call

def safeSend(String send){
    echo "sending message: ${send}"
}