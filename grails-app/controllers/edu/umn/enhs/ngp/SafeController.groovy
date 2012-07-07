package edu.umn.enhs.ngp

import grails.plugins.springsecurity.Secured

@Secured(['ROLE_NCS_PROTECTED'])
class SafeController {
    def springSecurityService
    def index() {
		def user = springSecurityService.principal

		def userFullName = user.username

		render "hello ${userFullName}"
	}
}
