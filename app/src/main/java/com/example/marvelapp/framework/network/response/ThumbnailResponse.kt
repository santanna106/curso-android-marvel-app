package com.example.marvelapp.framework.network.response

data class ThumbnailResponse(val path:String,
                             //@SerializedName("extension") => Se fosse necessário renomear o atributo de destino
                             val extension:String
)
