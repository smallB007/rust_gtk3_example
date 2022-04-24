use gtk::prelude::*;
use gtk::{Application, ApplicationWindow};

fn call_dynamic() -> Result<(), Box<dyn std::error::Error>> {
    unsafe {
        let lib = libloading::Library::new(
            "/home/artie/Documents/Projects/rust/rust_dyn_lib/target/debug/librust_dyn_lib.so",
        )?;
        let func: libloading::Symbol<fn()> = lib.get(b"call_rust_dyn_lib")?;
        Ok(func())
    }
}

fn main() {
    match call_dynamic() {
        Ok(_v) => {
            println!("OK");
        }
        Err(e) => {
            println!("Err:{e}");
        }
    }
    let app = Application::builder()
        .application_id("org.example.HelloWorld")
        .build();

    app.connect_activate(|app| {
        // We create the main window.
        let win = ApplicationWindow::builder()
            .application(app)
            .default_width(320)
            .default_height(200)
            .title("Hello, Rust World!")
            .build();
        let btn = gtk::Button::new();
        btn.set_label("label");
        win.add(&btn);
        // Don't forget to make all widgets visible.
        win.show_all();
        win.fullscreen();
    });

    app.run();
}
