package module

import module.engine.Diesel
import module.engine.Engine
import module.tier.SnowTier
import module.tier.Tier
import javax.inject.Inject
import javax.inject.Named

class Car @Inject constructor() {

    @Inject lateinit var engine: Engine
    @Inject @Named("겨울타이어") lateinit var tier: Tier

    fun engine(): String {
        return engine.engine()
    }

    fun tier(): String {
        return tier.tier()
    }
}