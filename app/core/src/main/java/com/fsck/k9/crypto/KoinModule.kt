package com.fsck.k9.crypto

import org.koin.dsl.module.applicationContext
import org.openintents.openpgp.util.OpenPgpApi
import org.sufficientlysecure.keychain.remote.OpenPgpService

val openPgpModule = applicationContext {
    bean { params -> OpenPgpService(get()) }
    bean { params -> OpenPgpApi(get(), get()) }
}