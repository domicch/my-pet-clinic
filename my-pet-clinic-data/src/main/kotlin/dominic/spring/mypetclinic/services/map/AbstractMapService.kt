package dominic.spring.mypetclinic.services.map

abstract class AbstractMapService<T, ID> {
    protected val map = mutableMapOf<ID, T>()

    fun findAll(): Set<T> {
        return map.values.toSet()
    }

    fun findById(id: ID): T? {
        return map[id]
    }

    fun save(id: ID, obj: T): T{
        map[id] = obj
        return obj
    }



    fun deleteById(id: ID){
        map.remove(id)
    }

    fun delete(obj: T){
        map.entries.removeIf{e -> e.value?.equals(obj)?:false }
    }
}