package di.module

import dagger.Module
import dagger.Provides
import module.engine.Engine
import module.engine.Gasoline
import module.engine.LPG
import module.tier.SnowTier
import module.tier.SummerTier
import module.tier.Tier
import javax.inject.Named

@Module
class CarModule {

    @Provides
    fun provideEngine(): Engine {
        return LPG()
    }

    @Provides
    fun provideTier(): Tier {
        return SummerTier()
    }

    @Provides
    @Named("겨울타이어")
    fun provideSnowTier(): Tier {
        return SnowTier()
    }
}