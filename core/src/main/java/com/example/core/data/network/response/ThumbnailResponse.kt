package com.example.core.data.network.response

data class ThumbnailResponse(val pah:String,
                             //@SerializedName("extension") => Se fosse necessário renomear o atributo de destino
                             val extension:String
)
