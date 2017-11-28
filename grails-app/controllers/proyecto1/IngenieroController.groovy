package proyecto1



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class IngenieroController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def principal() {	}
	
    def index(Integer max) {
		if( session.role < 2 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           params.max = Math.min(max ?: 10, 100)
           respond Ingeniero.list(params), model:[ingenieroInstanceCount: Ingeniero.count()]
		}   
    }

    def show(Ingeniero ingenieroInstance) {
		if( session.role < 3 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           respond ingenieroInstance
		}
    }

    def create() {
		if( session.role < 3 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           respond new Ingeniero(params)
		}   
    }

    @Transactional
    def save(Ingeniero ingenieroInstance) {
        if (ingenieroInstance == null) {
            notFound()
            return
        }

        if (ingenieroInstance.hasErrors()) {
            respond ingenieroInstance.errors, view:'create'
            return
        }

        ingenieroInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'ingeniero.label', default: 'Ingeniero'), ingenieroInstance.id])
                redirect ingenieroInstance
            }
            '*' { respond ingenieroInstance, [status: CREATED] }
        }
    }

    def edit(Ingeniero ingenieroInstance) {
        respond ingenieroInstance
    }

    @Transactional
    def update(Ingeniero ingenieroInstance) {
        if (ingenieroInstance == null) {
            notFound()
            return
        }

        if (ingenieroInstance.hasErrors()) {
            respond ingenieroInstance.errors, view:'edit'
            return
        }

        ingenieroInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Ingeniero.label', default: 'Ingeniero'), ingenieroInstance.id])
                redirect ingenieroInstance
            }
            '*'{ respond ingenieroInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Ingeniero ingenieroInstance) {

        if (ingenieroInstance == null) {
            notFound()
            return
        }

        ingenieroInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Ingeniero.label', default: 'Ingeniero'), ingenieroInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'ingeniero.label', default: 'Ingeniero'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
