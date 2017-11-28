package proyecto1



import grails.test.mixin.*
import spock.lang.*

@TestFor(MuestraController)
@Mock(Muestra)
class MuestraControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.muestraInstanceList
            model.muestraInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.muestraInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'POST'
            def muestra = new Muestra()
            muestra.validate()
            controller.save(muestra)

        then:"The create view is rendered again with the correct model"
            model.muestraInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            muestra = new Muestra(params)

            controller.save(muestra)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/muestra/show/1'
            controller.flash.message != null
            Muestra.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def muestra = new Muestra(params)
            controller.show(muestra)

        then:"A model is populated containing the domain instance"
            model.muestraInstance == muestra
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def muestra = new Muestra(params)
            controller.edit(muestra)

        then:"A model is populated containing the domain instance"
            model.muestraInstance == muestra
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'PUT'
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/muestra/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def muestra = new Muestra()
            muestra.validate()
            controller.update(muestra)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.muestraInstance == muestra

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            muestra = new Muestra(params).save(flush: true)
            controller.update(muestra)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/muestra/show/$muestra.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'DELETE'
            controller.dele(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/muestra/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def muestra = new Muestra(params).save(flush: true)

        then:"It exists"
            Muestra.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.dele(muestra)

        then:"The instance is deleted"
            Muestra.count() == 0
            response.redirectedUrl == '/muestra/index'
            flash.message != null
    }
}
