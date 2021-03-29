package dominic.spring.mypetclinic.services.sample

import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.beans.BeansException
import org.springframework.stereotype.Component

@Component
class CustomBeanPostProcessor: BeanPostProcessor {
    @Throws(BeansException::class)
    override fun postProcessBeforeInitialization(bean: Any, beanName: String): Any {
        if (bean is LifeCycleDemoBean) {
            bean.beforeInit()
        }
        return bean
    }

    @Throws(BeansException::class)
    override fun postProcessAfterInitialization(bean: Any, beanName: String): Any {
        if (bean is LifeCycleDemoBean) {
            bean.afterInit()
        }
        return bean
    }
}