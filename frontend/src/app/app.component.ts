import { Component, OnInit } from "@angular/core";
import { Car } from "./types";


@Component({
    selector: "app-root",
    styleUrls: ["./app.component.css"],
    templateUrl: "./app.component.html",})
export class AppComponent implements OnInit {

    title: string = "frontend";
    render: boolean = true;

    renderData: boolean = false;
    carList: Car[] = [];


    setRender(): void {
        this.render = !this.render;
        return;}


    async getData(): Promise<void> {

        console.log("fetching data");

        try {
            const response: Response = await fetch(

                // request url
                "http://localhost:9000/api/cars", {

                // request headers
                method: "GET",
                mode: "cors",
                headers: {"Content-Type": "application/json"},});

            console.log(response);

            const data: Car[] = await response.json();

            console.log(data);

            this.carList = data;
            this.renderData = true;}

        catch (error) {
            console.log(error);}

        return;}


    async ngOnInit(): Promise<void> {

        console.log("loading main app");
        await this.getData();

        return;}
}