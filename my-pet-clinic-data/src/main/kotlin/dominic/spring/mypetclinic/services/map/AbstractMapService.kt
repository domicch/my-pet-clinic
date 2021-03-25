package dominic.spring.mypetclinic.services.map

import dominic.spring.mypetclinic.model.BaseEntity

abstract class AbstractMapService<T: BaseEntity, ID: Long> {
    protected val map = mutableMapOf<Long, T>()

    @Synchronized fun findAll(): Set<T> {
        return map.values.toSet()
    }

    @Synchronized fun findById(id: Long): T? {
        return map[id]
    }

    @Synchronized fun save(obj: T): T{
        var id = obj.id
        if(id == null) {
            id = getNextId()
            obj.id = id
        }
        map[id] = obj
        return obj
    }

    @Synchronized fun deleteById(id: Long){
        map.remove(id)
    }

    @Synchronized fun delete(obj: T){
        map.entries.removeIf{e -> e.value.equals(obj) }
    }

    private fun getNextId(): Long{
        return (map.size+1).toLong()
    }
}