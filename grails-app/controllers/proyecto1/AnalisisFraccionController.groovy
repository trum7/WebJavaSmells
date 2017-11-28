package proyecto1



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AnalisisFraccionController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
		if( session.role < 2 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           params.max = Math.min(max ?: 10, 100)
           respond AnalisisFraccion.list(params), model:[analisisFraccionInstanceCount: AnalisisFraccion.count()]
		}  
    }

    def show(AnalisisFraccion analisisFraccionInstance) {
		if( session.role < 2 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           respond analisisFraccionInstance
		}   
    }

    def create() {
		if( session.role < 2 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           respond new AnalisisFraccion(params)
		}   
    }

    @Transactional
    def save(AnalisisFraccion analisisFraccionInstance) {
        if (analisisFraccionInstance == null) {
            notFound()
            return
        }

        if (analisisFraccionInstance.hasErrors()) {
            respond analisisFraccionInstance.errors, view:'create'
            return
        }

        analisisFraccionInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'analisisFraccion.label', default: 'AnalisisFraccion'), analisisFraccionInstance.id])
                redirect analisisFraccionInstance
            }
            '*' { respond analisisFraccionInstance, [status: CREATED] }
        }
    }

    def edit(AnalisisFraccion analisisFraccionInstance) {
        respond analisisFraccionInstance
    }

    @Transactional
    def update(AnalisisFraccion analisisFraccionInstance) {
        if (analisisFraccionInstance == null) {
            notFound()
            return
        }

        if (analisisFraccionInstance.hasErrors()) {
            respond analisisFraccionInstance.errors, view:'edit'
            return
        }

        analisisFraccionInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'AnalisisFraccion.label', default: 'AnalisisFraccion'), analisisFraccionInstance.id])
                redirect analisisFraccionInstance
            }
            '*'{ respond analisisFraccionInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(AnalisisFraccion analisisFraccionInstance) {

        if (analisisFraccionInstance == null) {
            notFound()
            return
        }

        analisisFraccionInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'AnalisisFraccion.label', default: 'AnalisisFraccion'), analisisFraccionInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'analisisFraccion.label', default: 'AnalisisFraccion'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
