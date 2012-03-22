package ca.ralsoft.gral1

class QuoteController {

    def index() {
        redirect(action: home)
    }
    
    def home = {
        render "<h1>Testing quote!!!</h1>"
    }
}
