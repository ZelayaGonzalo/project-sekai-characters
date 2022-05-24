interface Profile{
    height:string
    birthday:string
    hobby:string
    specialty:string
    favFood:string
    dislikeFood:string
    weakness:string
    school:string
    currentClass:string
    gender:string
    intro:string
    introVid:string
    va:string
}

export interface Member{
    id:number
    name:string
    color:string
    label:string
    icon:string
    image:string
    showOrder:number
    profile:Profile
    unit:Unit
    originalName:string
}

export interface Unit{
    id:number
    name:string
    logo:string
    background:string
    introVid:string
    intro:string
    color:string
    sekaiDesc:string
    sekaiIcon:string
    members:Member[]
}