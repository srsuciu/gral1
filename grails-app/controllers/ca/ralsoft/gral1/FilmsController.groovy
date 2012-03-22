package ca.ralsoft.gral1

class FilmsController {

    def index() {
        redirect(action: home)
    }
    
    def home = {
        render "<h1>Testing quote!!!</h1>"
    }
    
    def random = {
        def staticTitle = "Film title."
        def staticDescription = "Film description. Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    }
}
