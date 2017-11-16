def call(method) {
    timestamps {
        echo "given ${method}"
        switch(method){
            case "send": 
                sh "echo SLACK SEND"
            break;
            default:
                error
            break;
        }
    } // End Timestamps
} // End Call