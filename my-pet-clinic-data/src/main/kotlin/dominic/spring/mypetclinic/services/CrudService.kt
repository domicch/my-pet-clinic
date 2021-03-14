package dominic.spring.mypetclinic.services

interface CrudService<T, ID> {
    fun findAll(): Set<T>
    fun findById(id: ID): T?
    fun save(obj: T): T
    fun delete(obj: T)
    fun deleteById(id: ID)
}