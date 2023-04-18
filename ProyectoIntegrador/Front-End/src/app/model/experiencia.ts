export class Experiencia {
    id? : number;
    nombreE : string;
    empresaE : string;
    fechaE : string;
    descripcionE : string;

    constructor(nombreE: string, empresaE: string, fechaE: string, descripcionE: string){
        this.nombreE = nombreE;
        this.empresaE = empresaE;
        this.fechaE = fechaE;
        this.descripcionE = descripcionE;
    }
}
