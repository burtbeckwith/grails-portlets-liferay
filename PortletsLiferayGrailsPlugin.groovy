class PortletsLiferayGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.1 > *"
    // the other plugins this plugin depends on
    def dependsOn = [portlets:"0.2 > * "]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp"
    ]

    def author = "Kenji Nakamura"
    def authorEmail = "kenji_nakamura@diva-america.com"
    def title = "Liferay Portal Portlets Plugin"
    def description = '''\\
This plugin generates the configuration files for Liferay Portal in addition to
portlet.xml generated by portlets plugin. 
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/portlets-liferay"

    def doWithSpring = {
      portletContainerAdapter(org.codehaus.grails.portlets.container.liferay.LiferayPortletContainerAdapter)
    }

    def doWithApplicationContext = { applicationContext ->
    }

    def doWithWebDescriptor = { xml ->
    }

    def doWithDynamicMethods = { ctx ->
    }

    def onChange = { event ->
    }

    def onConfigChange = { event ->
    }
}