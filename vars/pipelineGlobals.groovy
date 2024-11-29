def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "203918861424"
        case 'qa':
            return "203918861424"
        case 'uat':
            return "203918861424"
        case 'pre-prod':
            return "203918861424"
        case 'prod':
            return "203918861424"
        default:
            return "nothing"
    } 
}