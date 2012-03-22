package ca.ralsoft.gral1

class FilmsDescriptionController {
    def scaffold = true
    def index() {
        redirect(action: list)
    }
}
